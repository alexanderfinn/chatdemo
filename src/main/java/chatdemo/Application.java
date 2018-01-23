package chatdemo;

import chatdemo.web.IndexController;
import chatdemo.web.Path;

import static spark.Spark.*;

public class Application {

  public static void main(String[] args) {

    // Basic Spark configuration
    port(8080);

    // Handler setup
    get(Path.HOME, (req, res) -> new IndexController().indexPage(req, res));

  }

}
