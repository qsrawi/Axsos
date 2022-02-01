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
account1=BankAccount(0.2 , 200)
account2=BankAccount(0.3 , 600)
account1.deposit(100).deposit(100).deposit(100).witdraw(200).interest().display_acount_info()
account2.deposit(600).deposit(700).witdraw(200).witdraw(200).witdraw(200).witdraw(200).interest().display_acount_info()