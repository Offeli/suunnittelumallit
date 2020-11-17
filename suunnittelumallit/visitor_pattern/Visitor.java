package visitor_pattern;

public interface Visitor {
	
	void visit(Numemon numemon);
	void visit(Sukamon sukamon);
	void visit(PlatinumSukamon platinumsukamon);
	
}
