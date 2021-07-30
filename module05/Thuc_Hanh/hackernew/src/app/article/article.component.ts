import {Component, OnInit} from '@angular/core';
import {Article} from '../model/Article';

@Component({
  selector: 'app-article',
  templateUrl: './article.component.html',
  styleUrls: ['./article.component.css']
})
export class ArticleComponent implements OnInit {
  title: string;
  url: string;
  article = {
    title: 'The Evolution of Async JavaScript: From Callbacks, to Promises, to Async/Await',
    url: 'https://medium.freecodecamp.org/the-evolution-of-async-javascript-from-callbacks-to-promises-to-async-await-e73b047f2f40'
  };
  constructor() {
  }
  ngOnInit(): void {
  }
  updateArticle() {
    this.article.title = this.title;
    this.article.url = this.url;
}
}
