# Generated by Django 5.0.6 on 2024-07-12 03:53

import app10.models
from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('app10', '0002_alter_student_student_gender'),
    ]

    operations = [
        migrations.AlterField(
            model_name='student',
            name='student_sem',
            field=models.IntegerField(validators=[app10.models.valid_sem]),
        ),
    ]
