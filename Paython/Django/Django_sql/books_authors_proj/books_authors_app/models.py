from django.db import models

class Book(models.Model):
	title = models.CharField(max_length=255)
	description=models.TextField(default='hello world !')
	created_at = models.DateTimeField(auto_now_add=True)
	updated_at = models.DateTimeField(auto_now=True)
class Publisher(models.Model):
		first_name = models.CharField(max_length=255,null=True)
		last_name = models.CharField(max_length=255)
		books = models.ManyToManyField(Book, related_name="publishers")
		notes=models.TextField(null=True)
		created_at = models.DateTimeField(auto_now_add=True)
		updated_at = models.DateTimeField(auto_now=True)

# Create your models here.
