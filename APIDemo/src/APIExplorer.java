import com.jcabi.github.Coordinates;
import com.jcabi.github.RtGithub;
import com.jcabi.github.Issue;
import com.jcabi.github.Github;
import com.jcabi.github.Repo;

public class APIExplorer {

	
	public static void main(String[] args) {
		
		Github github = new RtGithub(".. your OAuth token ..");
	    Repo repo = github.repos().get(new Coordinates.Simple("jcabi", "jcabi-github"));
	    
	}

}
