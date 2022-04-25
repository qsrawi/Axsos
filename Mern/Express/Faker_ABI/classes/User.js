class User {
    constructor(password, email, phoneNumber, lastName, firstNamem, id) {
      this.password = password;
      this.email = email;
      this.phoneNumber = phoneNumber;
      this.lastName = lastName;
      this.firstName = firstNamem;
      this._id = id;
    }
  }
  
  module.exports = User;