import {Component, OnInit} from '@angular/core';
import {Article} from '../model/Article';
import { articles } from '../repository/articleRepository';

@Component({
  selector: 'app-list-article',
  templateUrl: './list-article.component.html',
  styleUrls: ['./list-article.component.css']
})
export class ListArticleComponent implements OnInit {
  articleId: Article[] = articles;
  constructor() {
  }

  ngOnInit(): void {
  }
  addArticle(){
  }
}
