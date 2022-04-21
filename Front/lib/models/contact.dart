class Contact {
  final String id;
  final String name;
  final String email;
  final String phone;
  final String status;

  Contact({this.id, this.name, this.email, this.phone, this.status });

  factory Contact.fromJson(Map<String, dynamic> json) {
    return Contact(
      id: json ['id'] as String,
      name: json['name'] as String,
      email: json['email'] as String,
      phone: json['phone'] as String,
      status: json['status'] as String,
    );
  }

  @override
  String toString() {
    return 'Trans{id: $id, email: $email, name: $name, phone: $phone}';
  }
}