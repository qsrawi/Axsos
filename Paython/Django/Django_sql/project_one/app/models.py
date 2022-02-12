from django.db import models

class Dojo(models.Model):
    name=models.CharField(max_length=255)
    city=models.CharField(max_length=255)
    state=models.CharField(max_length=2)
    desc=models.TextField(default="hello world")
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)

class Ninga(models.Model):
    dojo = models.ForeignKey(Dojo, related_name="ninga", on_delete = models.CASCADE)
    first_name=models.CharField(max_length=255)
    last_name=models.CharField(max_length=255)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
# Create your models here.
