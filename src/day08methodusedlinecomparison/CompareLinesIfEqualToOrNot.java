package day08methodusedlinecomparison;

public class CompareLinesIfEqualToOrNot {

	byte number;

//generate_number ::
			byte generateNumber() {
				number = (byte)(Math.random()*100);
			return number;
			}
			
//Compare_Lines
			void compareLineLength(float lineOne, float lineTwo) {
				String stringOne=Float.toString(lineOne);
				String stringTwo=Float.toString(lineTwo);
				System.out.println(stringOne.compareTo(stringTwo)==0 ? " :: Lines Are Equal :: ":stringOne.compareTo(stringTwo)>0 ?" :: Line{1} is greater than Line{2}  :: ":" :: Line{2} is greater than Line{1}  :: ");
			}
			
//check_if_equal_to
			void checIfLineLengthIsEqual(float lineOne, float lineTwo) {
				String stringOne=Float.toString(lineOne);
				String stringTwo=Float.toString(lineTwo);
				System.out.println(stringOne.equals(stringTwo) ? " :: Lines Are Equal :: " : " :: Lines Are Not Equal :: ");
			}
			
//Calculate_Line_length
			float lineLen(byte x1, byte y1,byte x2,byte y2) {
				float length= (float)(Math.sqrt( (Math. pow((x1-x2),2) + Math. pow((y1-y2),2)) ));
			return length;
			}
	
//main_method
	public static void main(String[] args) {
		CompareLinesIfEqualToOrNot lenFirstObject = new CompareLinesIfEqualToOrNot();
		

		float lineOne = lenFirstObject.lineLen(lenFirstObject.generateNumber(), lenFirstObject.generateNumber(), lenFirstObject.generateNumber(), lenFirstObject.generateNumber());
		float lineTwo = lenFirstObject.lineLen(lenFirstObject.generateNumber(), lenFirstObject.generateNumber(), lenFirstObject.generateNumber(), lenFirstObject.generateNumber());
		
		System.out.println("Lenth of Line{1} with (x1,y1) & (x2,y2) Co-ordinates (cm):: "+ lineOne);
		System.out.println("Lenth of Line{2} with (x3,y3) & (x4,y4) Co-ordinates (cm):: "+ lineTwo);
		
		lenFirstObject.checIfLineLengthIsEqual(lineOne, lineTwo);
		System.out.println("");
		lenFirstObject.compareLineLength(lineOne, lineTwo);
	}
}
