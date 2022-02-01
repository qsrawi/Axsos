class User:		
    def __init__(self, name, email):
        self.name = name
        self.email = email
        self.account_balance = 0
    def display_user_balance(self):
        print(f"user:{self.name} money:{self.account_balance}")
    def make_withdrawal(self, amount):
        self.account_balance -=amount
    def make_deposit(self, amount):
    	self.account_balance += amount
    
    
oday=User("oday","asfdoahfs")
oday.make_deposit(100)
print(oday.account_balance)

