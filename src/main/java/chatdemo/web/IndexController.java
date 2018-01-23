package chatdemo.web;

import spark.Request;
import spark.Response;

public class IndexController implements Renderer {

  public String indexPage(Request req, Response res) throws PageNotFoundException {
    return render("index.html");
  }


}
