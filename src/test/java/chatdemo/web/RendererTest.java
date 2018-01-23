package chatdemo.web;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;

import static org.junit.Assert.*;


public class RendererTest {

  private Renderer renderer;

  @Before
  public void setUp() throws Exception {
    this.renderer = new Renderer() {};
  }

  @Test
  public void testRender() throws PageNotFoundException {
    String rendered = renderer.render("testpage.txt");
    assertEquals("TEST", rendered);
  }

  @Test
  public void testRenderMissingPage() {
    try {
      renderer.render("pagedoesnotexist.txt");
      fail("Should throw an expection if page name is misspelled");
    } catch (PageNotFoundException e) {

    }
  }

}
