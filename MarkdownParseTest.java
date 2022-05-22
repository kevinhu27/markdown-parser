import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MarkdownParseTest {

    @Test
    public void parselink() throws IOException {
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);

        assertEquals("check if output of parse is correct", List.of("https://something.com", "some-thing.html"), links);
        
    }

    @Test
    public void parseWithImageLink() throws IOException{
        Path fileName = Path.of("test-file3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);

        assertEquals(List.of("https://www.google.com/", "https://www.youtube.com/"), links);

    }

    @Test
    public void parseWithFormatLink() throws IOException {
        Path fileName = Path.of("test-file2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);

        assertEquals(List.of("https://www.google.com/", "https://www.youtube.com/"), links);
    }

    @Test
    public void parseWithEmptyFile() throws IOException {
        Path fileName = Path.of("test-file1.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);

        assertEquals(List.of(), links);

    }

    @Test
    public void parse11() throws IOException {
        Path fileName = Path.of("test-file1.1.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);

        assertEquals("check if output of parse is correct", List.of("https://something.com", "some-thing.html"), links);

    }

    @Test
    public void parse12() throws IOException {
        Path fileName = Path.of("test-file1.2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);

        assertEquals("check if output of parse is correct", List.of("https://something.com", "some-page.html"), links);

    }

    @Test
    public void parse13() throws IOException {
        Path fileName = Path.of("test-file1.3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);

        assertEquals(List.of(), links);

    }

    @Test
    public void parse14() throws IOException {
        Path fileName = Path.of("test-file1.4.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);

        assertEquals(List.of(), links);
    }

    @Test
    public void parse15() throws IOException {
        Path fileName = Path.of("test-file1.5.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);

        assertEquals(List.of(), links);

    }

    @Test
    public void parse16() throws IOException {
        Path fileName = Path.of("test-file1.6.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);

        assertEquals(List.of(), links);

    }

    @Test
    public void parse17() throws IOException {
        Path fileName = Path.of("test-file1.7.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);

        assertEquals(List.of(), links);

    }

    @Test
    public void parse18() throws IOException {
        Path fileName = Path.of("test-file1.8.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);

        assertEquals(List.of("a link on the first line"), links);

    }

    @Test
    public void parseTester() throws IOException {
        Path fileName = Path.of("Tester.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);

        assertEquals(List.of("https://www.youtube.com/watch?v=dQw4w9WgXcQ", "https://www.google.com/"), links);

    }

    @Test
    public void parseReport1() throws IOException {
        Path fileName = Path.of("test-file-report-1.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);

        assertEquals(List.of("url.com", "google.com", "google.com", "ucsd.edu"), links);

    }

    @Test
    public void parseReport2() throws IOException {
        Path fileName = Path.of("test-file-report-2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);

        assertEquals(List.of("b.com", "a.com", "example.com"), links);
    }

    @Test
    public void parseReport3() throws IOException {
        Path fileName = Path.of("test-file-report-3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);

        assertEquals(List.of("https://www.twitter.com", "https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule", 
        "github.com", "https://cse.ucsd.edu/"), links);
    }




}

