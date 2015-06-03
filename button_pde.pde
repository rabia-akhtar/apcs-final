class Button {
  static final int xdiam = 50, ydiam = 50; // diameters x, y
  static final int xwidth = xdiam >> 1;     // radius x
  static final int yheight = ydiam >> 1;     // radius  
  final int left, right, top, bottom, xcent, ycent; // button edges and Center Coords
  final String label;

  Button (int xcoor, int ycoor, String operation) {  
    label = operation;
    left = xcoor - xwidth;
    right = xcoor + xwidth;
    top = ycoor - yheight;
    bottom = ycoor + yheight;
    xcent = xcoor;
    ycent = ycoor;
  }
  
  void display() {
      PFont f = createFont("Times New Roman", 15, true);
      textFont(f, 15);
      textAlign(CENTER);
      fill(232);
      rect(xcent, ycent, xdiam, ydiam, 10);
      fill(0);
      text(label, xcent, ycent + 10);
    
  }
  
    boolean OnTop() {
    return mouseX > left & mouseX < right 
      & mouseY > top & mouseY < bottom;
  }
}
