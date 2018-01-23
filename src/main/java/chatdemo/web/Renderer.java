package chatdemo.web;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public interface Renderer {

  default String render(String s) throws PageNotFoundException {
    try {
      byte[] encoded = Files.readAllBytes(
          Paths.get(
              Renderer.class.getResource("/pages/" + s).toURI()
          )
      );

      return new String(encoded, Charset.forName("utf-8"));
    } catch(Exception e) {
      throw new PageNotFoundException();
    }
  }

}
