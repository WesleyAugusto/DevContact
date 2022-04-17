class Cases {

  final String name;
  final String email;
  final String phone;
  final String status;

  Cases({ this.name, this.email, this.phone, this.status });

  factory Cases.fromJson(Map<String, dynamic> json) {
    return Cases(
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