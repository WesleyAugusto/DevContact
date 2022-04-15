import 'package:devcontact/services/api_service.dart';
import 'package:flutter/material.dart';

import 'models/cases.dart';

enum Gender { male, female }
enum Status { positive, dead, recovered }

class AddDataWidget extends StatefulWidget {
  AddDataWidget();

  @override
  _AddDataWidgetState createState() => _AddDataWidgetState();
}

class _AddDataWidgetState extends State<AddDataWidget> {
  _AddDataWidgetState();

  final ApiService api = ApiService();
  final _addFormKey = GlobalKey<FormState>();
  final _nameController = TextEditingController();
  String gender = 'male';
  Gender _gender = Gender.male;
  final _ageController = TextEditingController();
  final _addressController = TextEditingController();
  final _cpfController = TextEditingController();
  final _cityController = TextEditingController();
  final _countryController = TextEditingController();
  String status = 'positive';
  Status _status = Status.positive;

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
                                controller: _cpfController,
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
                                controller: _cpfController,
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
                                  value: Status.positive,
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
                                  value: Status.dead,
                                  groupValue: _status,
                                  onChanged: (Status value) {
                                    setState(() {
                                      _status = value;
                                      status = 'Fixo';
                                    });
                                  },
                                ),
                              ),
                              ListTile(
                                title: const Text('Recovered'),
                                leading: Radio(
                                  value: Status.recovered,
                                  groupValue: _status,
                                  onChanged: (Status value) {
                                    setState(() {
                                      _status = value;
                                      status = 'recovered';
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
                                    api.createCase(Cases(name: _nameController.text, gender: gender, age: int.parse(_ageController.text), cpf: _cpfController.text, address: _addressController.text, city: _cityController.text, country: _countryController.text, status: status));

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