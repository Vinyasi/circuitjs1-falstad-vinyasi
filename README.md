# circuitjs1-falstad-vinyasi
Hosted at: http://vinyasi.info/ne

Added a dropdown menubar to Paul Falstad's Electronic Simulator for displaying my circuits in addition to his:
https://github.com/pfalstad/circuitjs1

Since I'm not a programmer and don't fully appreciate the Java language, I can't finish all of my tweaks. The addition of a dropdown menubar highlighting my circuits focusing on electrical surges has been added to Paul's CirSim.java file. But these two circuit-listing, dropdown menubars -- his and mine -- randomly alternate their position relative to each other. Sometimes one is to the left of the other, sometimes they're reversed, every time the page loads into the browser. I suspect the architecture of their being written out to the browser's screen has to be restructered to accommodate multiple circuit listings? The best I can do is add my own, retain his, and assign unique titles/labels at the top of both.

Among the various alterations to this software, the earliest were...

Within the 'About' box, I added a link to here:
https://github.com/Vinyasi/circuitjs1-falstad-vinyasi

And a link to my website:
http://vinyasi.info/

Added an image to the 'About' popup box to brand my site:
http://vinyasi.info/circuitjs1/immortality-25pc.jpg

And added a 'Circuit Information' button to the upper right-hand corner of the simulator for a few circuits. The first circuit I added this button was for displaying a sine wave via a mathematical function...

For more information, see Mathlets' Poles and Vibrations:
http://mathlets.org/mathlets/poles-and-vibrations/

It comes closest to what I try and simulate, namely: surges which reach to infinity if not held in check by the circuit.

pc-sim-falstad-vinyasi.zip is precompiled for deployment on your home computer for faster response independent of the web.
