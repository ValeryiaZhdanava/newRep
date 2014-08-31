package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Text extends Document{
private List<Sentence> ListText;

public Text() {
	ListText = new ArrayList<Sentence>();
}
public List<Sentence> getText() {
	return Collections.unmodifiableList(ListText);
}

public void setText(List<Sentence> ListText){
	this.ListText=ListText;
}
}
