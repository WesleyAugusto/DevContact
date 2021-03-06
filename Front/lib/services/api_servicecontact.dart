import 'dart:convert';

import 'package:devcontact/models/contact.dart';
import 'package:flutter/material.dart';
import 'package:http/http.dart';

class ApiServiceContact {
  final String apiUrl = "http://localhost:8084/api";

  Future<List<Contact>> getContacts() async {
    Response res = await get(apiUrl);

    if (res.statusCode == 200) {
      List<dynamic> body = jsonDecode(res.body);
      List<Contact> contacts = body.map((dynamic item) => Contact.fromJson(item)).toList();
      return contacts;
    } else {
      throw "Falha em encontrar uma lista de contatos";
    }
  }

  Future<Contact> getContactById(String id) async {
    print(id);
    final response = await get('$apiUrl/$id');

    if (response.statusCode == 200) {
      return Contact.fromJson(json.decode(response.body));
    } else {
      throw Exception('Falha ao carregar o contato');
    }
  }

  Future<Contact> createContact(Contact contact) async {
    Map data = {
      'email': contact.email,
      'name': contact.name,
      'phone': contact.phone,
      'status': contact.status
    };

    final Response response = await post(
      apiUrl,
      headers: <String, String>{
        'Content-Type': 'application/json; charset=UTF-8',
      },
      body: jsonEncode(data),
    );

    if (response.statusCode == 201) {
      return Contact.fromJson(json.decode(response.body));
    } else {
      throw Exception('Falha ao criar contato');
    }
  }

  Future<Contact> updateContact(String id, Contact contact) async {
    Map data = {
      'id': contact.id,
      'email': contact.email,
      'name': contact.name,
      'phone': contact.phone,
      'status': contact.status
    };

    final Response response = await put(
      '$apiUrl/$id',
      headers: <String, String>{
        'Content-Type': 'application/json; charset=UTF-8',
      },
      body: jsonEncode(data),
    );
    if (response.statusCode == 200) {
      return Contact.fromJson(json.decode(response.body));
    } else {
      throw Exception('Failed to update a case');
    }
  }

  Future<void> deleteContact(String id) async {
    final Response response = await delete('$apiUrl/$id');
    if (response.statusCode == 200) {
      print("Contato Deletado");
    } else {
      throw "Falha ao Deletar um Contato.";
    }
  }
}