export class Article {
  id: number;
  url: string;
  title: string;
  constructor(id: number, title: string, url: string) {
  this.id = id;
  this.title = title;
  this.url = url;
}
}
