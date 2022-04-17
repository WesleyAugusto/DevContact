import 'dart:convert';

import 'package:devcontact/models/cases.dart';
import 'package:http/http.dart';

class ApiService {
  final String apiUrl = "http://localhost:8084/api";

  Future<List<Cases>> getCases() async {
    Response res = await get(apiUrl);

    if (res.statusCode == 200) {
      List<dynamic> body = jsonDecode(res.body);
      List<Cases> cases = body.map((dynamic item) => Cases.fromJson(item)).toList();
      return cases;
    } else {
      throw "Failed to load cases list";
    }
  }

  Future<Cases> getCaseById(String email) async {
    final response = await get('$apiUrl/$email');

    if (response.statusCode == 200) {
      return Cases.fromJson(json.decode(response.body));
    } else {
      throw Exception('Failed to load a case');
    }
  }

  Future<Cases> createCase(Cases cases) async {
    Map data = {
      'email': cases.email,
      'name': cases.name,
      'phone': cases.phone,
      'status': cases.status
    };

    final Response response = await post(
      apiUrl,
      headers: <String, String>{
        'Content-Type': 'application/json; charset=UTF-8',
      },
      body: jsonEncode(data),
    );

    if (response.statusCode == 200) {
      return Cases.fromJson(json.decode(response.body));
    } else {
      throw Exception('Failed to post cases');
    }
  }

  Future<Cases> updateCases(String email, Cases cases) async {
    Map data = {
      'email': cases.email,
      'name': cases.name,
      'phone': cases.phone,
      'status': cases.status
    };

    final Response response = await put(
      '$apiUrl/$email',
      headers: <String, String>{
        'Content-Type': 'application/json; charset=UTF-8',
      },
      body: jsonEncode(data),
    );
    if (response.statusCode == 200) {
      return Cases.fromJson(json.decode(response.body));
    } else {
      throw Exception('Failed to update a case');
    }
  }

  Future<void> deleteCase(String email) async {
    print("delete " +email);
    final Response response = await delete('$apiUrl/$email');
    print(response.body);
    print(response.statusCode);
    if (response.statusCode == 200) {
      print("Case deleted");
    } else {
      throw "Failed to delete a case.";
    }
  }
}