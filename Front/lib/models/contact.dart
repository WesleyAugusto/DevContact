class Contact {

  final String name;
  final String email;
  final String phone;
  final String status;

  Contact({ this.name, this.email, this.phone, this.status });

  factory Contact.fromJson(Map<String, dynamic> json) {
    return Contact(
      name: json['name'] as String,
      email: json['email'] as String,
      phone: json['phone'] as String,
      status: json['status'] as String,
    );
  }

  @override
  String toString() {
    return 'Trans{email: $email, name: $name, phone: $phone}';
  }
}