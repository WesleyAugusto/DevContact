import 'package:flutter/material.dart';

import 'listcontact.dart';
import '../../models/contact.dart';
import 'adddatacontactwidget.dart';
import '../../services/api_servicecontact.dart';

class ListDataContacts extends StatefulWidget {
  ListDataContacts();

  @override
  _ListDataContactsState createState() => _ListDataContactsState();
}

class _ListDataContactsState extends State<ListDataContacts> {
  final ApiServiceContact api = ApiServiceContact();
  List<Contact> contactsList;

  @override
  Widget build(BuildContext context) {
    if(contactsList == null) {
      contactsList = List<Contact>();
    }
    // This method is rerun every time setState is called, for instance as done
    // by the _incrementCounter method above.
    //
    // The Flutter framework has been optimized to make rerunning build methods
    // fast, so that you can just rebuild anything that needs updating rather
    // than having to individually change instances of widgets.
    return Scaffold(
      appBar: AppBar(
        // Here we take the value from the MyHomePage object that was created by
        // the App.build method, and use it to set our appbar title.
        title: Text('Lista de Contatos'),
      ),
      body: new Container(
        child: new Center(
            child: new FutureBuilder(
              future: loadList(),
              builder: (context, snapshot) {
                return contactsList.length > 0? new ContactsList(contacts: contactsList):
                new Center(child:
                new Text('Para adicionar um contato clique no botao inferior direito!', style: Theme.of(context).textTheme.titleMedium   ));
              },
            )
        ),
      ),
      floatingActionButton: FloatingActionButton(
        onPressed: () {
          _navigateToAddScreen(context);
        },
        tooltip: 'Increment',
        child: Icon(Icons.add),
      ), // This trailing comma makes auto-formatting nicer for build methods.
    );
  }

  Future loadList() {
    Future<List<Contact>> futureContacts = api.getContacts();
    futureContacts.then((contactsList) {
      setState(() {
        this.contactsList = contactsList;
      });
    });
    return futureContacts;
  }

  _navigateToAddScreen (BuildContext context) async {
    final result = await Navigator.push(
      context,
      MaterialPageRoute(builder: (context) => AddDataContactWidget()),
    );
  }
}