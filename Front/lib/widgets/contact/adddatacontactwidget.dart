import 'package:devcontact/services/api_servicecontact.dart';
import 'package:flutter/material.dart';

import '../../models/contact.dart';

enum Status { celular, fixo }

class AddDataContactWidget extends StatefulWidget {
  AddDataContactWidget();

  @override
  _AddDataContactWidgetState createState() => _AddDataContactWidgetState();
}

class _AddDataContactWidgetState extends State<AddDataContactWidget> {
  _AddDataContactWidgetState();

  final ApiServiceContact api = ApiServiceContact();
  final _addFormKey = GlobalKey<FormState>();
  final _nameController = TextEditingController();
  final _emailController = TextEditingController();
  final _phoneController = TextEditingController();
  String status = 'celular';
  Status _status = Status.celular;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Adicionar Contatos'),
      ),
      body: Form(
        key: _addFormKey,
        child: SingleChildScrollView(
          child: Container(
            padding: EdgeInsets.all(20.0),
            child: Card(
                child: Container(
                    padding: EdgeInsets.all(10.0),
                    width: 440,
                    child: Column(
                      children: <Widget>[
                        Container(
                          margin: EdgeInsets.fromLTRB(0, 0, 0, 10),
                          child: Column(
                            children: <Widget>[
                              Text('Nome Completo'),
                              TextFormField(
                                controller: _nameController,
                                decoration: const InputDecoration(
                                  hintText: 'Nome Completo',
                                ),
                                validator: (value) {
                                  if (value.isEmpty) {
                                    return 'Nome Invalido';
                                  }
                                  return null;
                                },
                                onChanged: (value) {},
                              ),
                            ],
                          ),
                        ),



                        Container(
                          margin: EdgeInsets.fromLTRB(0, 0, 0, 10),
                          child: Column(
                            children: <Widget>[
                              Text('Email'),
                              TextFormField(
                                controller: _emailController,
                                decoration: const InputDecoration(
                                  hintText: 'Email',
                                ),
                                validator: (value) {
                                  if (value.isEmpty) {
                                    return 'Email Invalido';
                                  }
                                  return null;
                                },
                                onChanged: (value) {},
                              ),
                            ],
                          ),
                        ),
                        Container(
                          margin: EdgeInsets.fromLTRB(0, 0, 0, 10),
                          child: Column(
                            children: <Widget>[
                              Text('Telefone'),
                              TextFormField(
                                controller: _phoneController,
                                decoration: const InputDecoration(
                                  hintText: 'Telefone',
                                ),
                                validator: (value) {
                                  if (value.isEmpty) {
                                    return 'Telefone Invalido';
                                  }
                                  return null;
                                },
                                onChanged: (value) {},
                              ),
                            ],
                          ),
                        ),


                        Container(
                          margin: EdgeInsets.fromLTRB(0, 0, 0, 10),
                          child: Column(
                            children: <Widget>[
                              Text('Marcador'),
                              ListTile(
                                title: const Text('Celular'),
                                leading: Radio(
                                  value: Status.celular,
                                  groupValue: _status,
                                  onChanged: (Status value) {
                                    setState(() {
                                      _status = value;
                                      status = 'Celular';
                                    });
                                  },
                                ),
                              ),
                              ListTile(
                                title: const Text('Fixo'),
                                leading: Radio(
                                  value: Status.fixo,
                                  groupValue: _status,
                                  onChanged: (Status value) {
                                    setState(() {
                                      _status = value;
                                      status = 'Fixo';
                                    });
                                  },
                                ),
                              ),
                            ],
                          ),
                        ),
                        Container(
                          margin: EdgeInsets.fromLTRB(0, 0, 0, 10),
                          child: Column(
                            children: <Widget>[
                              RaisedButton(
                                splashColor: Colors.red,
                                onPressed: () {
                                  if (_addFormKey.currentState.validate()) {
                                    _addFormKey.currentState.save();
                                    api.createContact(Contact(name: _nameController.text, email: _emailController.text, phone: _phoneController.text, status: status));

                                    Navigator.pop(context) ;
                                  }
                                },
                                child: Text('Save', style: TextStyle(color: Colors.white)),
                                color: Colors.blue,
                              )
                            ],
                          ),
                        ),
                      ],
                    )
                )
            ),
          ),
        ),
      ),
    );
  }
}