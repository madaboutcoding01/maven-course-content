package training.maven.quick;
import org.apache.commons.lang3.StringUtils;
public class Application{
	public Application(){}
	public int countWords(String words){
		String [] sepearateWords=StringUtils.split(words,' ');
		return (sepearateWords==null)?0:sepearateWords.length;
	}

}