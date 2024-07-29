from django.shortcuts import render

# Create your views here.
from django.views.generic import DetailView
from .models import NewsItem

class NewsItemDetailView(DetailView):
    model = NewsItem
    template_name = 'news_item_detail.html'
