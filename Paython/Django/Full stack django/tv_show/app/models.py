from django.db import models

class MovieManager(models.Manager):
    def basic_validator(self,post_data):
        errors={}
        if len(post_data['title']) < 2:
            errors['title'] = 'Title should be at least 2 characters'
        if len(post_data['network']) < 3:
            errors['network'] = 'network should be at least 3 characters'
        if len(post_data['desc']) < 10:
            errors['desc'] = 'network should be at least 10 characters'
        return errors


class Movie(models.Model):
    title = models.CharField(max_length=255)
    network=models.CharField(max_length=255)
    release_date=models.DateTimeField()
    description=models.TextField()
    created_at=models.DateTimeField(auto_now_add=True)
    updated_at=models.DateTimeField(auto_now=True)
    objects=MovieManager()

# Create your models here.
