import 'package:flutter/material.dart';
import 'package:devcontact/services/api_service.dart';
import 'models/cases.dart';


enum Status { celular, fixo }

class EditDataWidget extends StatefulWidget {
  EditDataWidget(this.cases);

  final Cases cases;

  @override
  _EditDataWidgetState createState() => _EditDataWidgetState();
}
class _EditDataWidgetState extends State<EditDataWidget> {
  _EditDataWidgetState();

  final ApiService api = ApiService();
  final _addFormKey = GlobalKey<FormState>();
  String email = '';
  final _nameController = TextEditingController();
  final _emailController = TextEditingController();
  final _phoneController = TextEditingController();

  String status = 'Celular';
  Status _status = Status.celular;

  @override
  void initState() {
    email = widget.cases.email;
    _nameController.text = widget.cases.name;

    status = widget.cases.status;
    if(widget.cases.status == 'Celular') {
      _status = Status.celular;
    } else if(widget.cases.status == 'Fixo') {
      _status = Status.fixo;
    }
    super.initState();
  }
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Editar Contato'),
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
                                    api.updateCases(email, Cases(name: _nameController.text, email: _emailController.text, phone: _phoneController.text, status: status));
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