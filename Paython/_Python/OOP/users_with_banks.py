class BankAccount:
    def __init__(self, int_rate, balance):
        self.int_rate=int_rate
        self.balance=balance
    def deposit(self,amount):
        self.balance +=amount
        return self
    def witdraw(self,amount):
        self.balance -=amount
        return self
    def display_acount_info(self):
        print(f"balance = {self.balance} interest rate = {self.int_rate}")
    def interest(self):
        if self.balance>0:
            self.int_rate *= self.balance
            return self
class User:		
    def __init__(self, name, email):
        self.name = name
        self.email = email
        self.account = BankAccount(int_rate=0.2,balance=500)
    def display_user_balance(self):
        print(f"user:{self.name} money:{self.account.balance}")
    def make_withdrawal(self, amount):
        self.account.witdraw(100)
        return self
    def make_deposit(self, amount):
        self.account.deposit(500)
        return self
oday=User("oday","oday@gmail.com")
oday.make_deposit(100).make_withdrawal(50).display_user_balance()