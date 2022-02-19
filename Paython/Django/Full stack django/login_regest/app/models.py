from django.db import models
import re
class UserManager(models.Manager):
    def register_valedator(self,post_data):
        errors={}
        if len(post_data['first_name']) < 2:
            errors['first_name']="First name should be at least 2 characters"
        if len(post_data['last_name']) < 2:
            errors['last_name']="last name should be at least 2 characters"
        if len(post_data['password']) < 8:
            errors['password']="password should be at least 8 characters"
        EMAIL_REGEX = re.compile(r'^[a-zA-Z0-9.+_-]+@[a-zA-Z0-9._-]+\.[a-zA-Z]+$')
        if not EMAIL_REGEX.match(post_data['email']): 
            errors['email'] = "Invalid email address!"
        if post_data['confirm_pw'] != post_data['password']:
            errors['confirm_pw']="the passwords arent match"
        return errors
    def login_valedator(self,post_data):
        errors={}
        if len(post_data['email']) < 11:
            errors['email']="Invalid email"
        if len(post_data['password']) < 8:
            errors['password']="Invalid password"
        return errors
class User(models.Model):
    first_name=models.CharField(max_length=255)
    last_name=models.CharField(max_length=255)
    email=models.CharField(max_length=255)
    password=models.CharField(max_length=255)
    created_at=models.DateTimeField(auto_now_add=True)
    updated_at=models.DateTimeField(auto_now=True)
    objects=UserManager()
# Create your models here.
