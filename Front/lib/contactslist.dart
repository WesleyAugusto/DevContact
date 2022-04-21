import 'package:flutter/material.dart';
import 'package:devcontact/models/contact.dart';
import 'detailwidget.dart';

class ContactsList extends StatelessWidget {

  final List<Contact> contacts;
  ContactsList({Key key, this.contacts}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return
      ListView.builder(
          itemCount: contacts == null ? 0 : contacts.length,
          itemBuilder: (BuildContext context, int index) {
            return
              Card(
                  child: InkWell(
                    onTap: () {
                      Navigator.push(
                        context,
                        MaterialPageRoute(
                            builder: (context) => DetailWidget(contacts[index])),
                      );
                    },
                    child: ListTile(
                      leading: Icon(Icons.person),
                      title: Text(contacts[index].name),
                      subtitle: Text(contacts[index].phone.toString()),

                    ),
                  )
              );
          });
  }

}