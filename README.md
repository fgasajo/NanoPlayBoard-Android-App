# NanoPlayBoard Android App

Simple Android app to **experiment and play** with the [Arduino Nano Play Board][1]. The [Arduino Nano Play Board][1] is a board designed by [Antonio Morales][2] and it was designed for an introductory workshop about soldering organized by [HackLab Almería][3]. You can see the gallery of images [here][4].

The [Arduino Nano Play Board][1] is an **excellent educational resource** for those students who want **to learn basic electronic and programming**. 

The aim of this Android app is to expand the possibilities of the use of the [Arduino Nano Play Board][1], by allowing you to interact with the sensors and actuators available on the board or even interact with other elements connected to Internet.

For more information about the board please visit us at:  

* http://github.com/AntonioMR/Nano-Play-Board

For more information about the project please visit us at:

* http://nanoplayboard.org

![upperside][5]
![underside][6]

## What do I need to use it?

### USB OTG version
![USB OTG][usb_otg_version]

* Arduino Nano Play Board.
* Arduino Nano + USB cable.
* USB OTG cable.
* Android device (version >= 4.1.x)

### Bluetooth version
![Bluetooth][bluetooth_version]

* Arduino Nano Play Board.
* Arduino Nano.
* Arduino compatible Bluetooth module (HC-05 or HC-06).
* Android device (version >= 4.1.x)

## Demo video

*Coming soon...*

## Screenshots

<img src="screenshots/potentiometer.png" height="450" alt="Potentiometer"/> <img src="screenshots/ldr.png" height="450" alt="LDR"/> <img src="screenshots/rgb_led.png" height="450" alt="RGB LED"/> <img src="screenshots/buzzer.png" height="450" alt="Buzzer"/> <img src="screenshots/ledmatrix.png" height="450" alt="Led Matrix"/> <img src="screenshots/ledmatrix_pattern.png" height="450" alt="Led Matrix Pattern"/> <img src="screenshots/ledmatrix_voice.png" height="450" alt="Led Matrix Voice"/> 

## Libraries used in this project

* [UsbSerial][14]
* [Gson][15]
* [MarkView][16]
* [ColorPicker][17]
* [Android-BluetoothSPPLibrary][18]
* [EventBus][19]

## License

```
Copyright 2016 José Juan Sánchez

Licensed under the GNU General Public License, Version 3 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.gnu.org/licenses/gpl-3.0.en.html

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```

[1]: http://github.com/AntonioMR/Nano-Play-Board
[2]: http://twitter.com/antonio1010mr
[3]: http://hacklabalmeria.net
[4]: https://goo.gl/photos/VKdNkxRcpEW4yBa47
[5]: https://github.com/josejuansanchez/NanoPlayBoard-Arduino-Library/blob/master/extras/upperside_v1.png
[6]: https://github.com/josejuansanchez/NanoPlayBoard-Arduino-Library/blob/master/extras/underside_v1.png
[7]: https://github.com/josejuansanchez/NanoPlayBoard-AndroidApp/blob/master/screenshots/potentiometer.png
[8]: https://github.com/josejuansanchez/NanoPlayBoard-AndroidApp/blob/master/screenshots/ldr.png
[9]: https://github.com/josejuansanchez/NanoPlayBoard-AndroidApp/blob/master/screenshots/rgb_led.png
[10]: https://github.com/josejuansanchez/NanoPlayBoard-AndroidApp/blob/master/screenshots/buzzer.png
[11]: https://github.com/josejuansanchez/NanoPlayBoard-AndroidApp/blob/master/screenshots/ledmatrix.png
[12]: https://github.com/josejuansanchez/NanoPlayBoard-AndroidApp/blob/master/screenshots/ledmatrix_pattern.png
[13]: https://github.com/josejuansanchez/NanoPlayBoard-AndroidApp/blob/master/screenshots/ledmatrix_voice.png
[14]: https://github.com/felHR85/UsbSerial
[15]: https://github.com/google/gson
[16]: https://github.com/xiprox/MarkView
[17]: https://github.com/christophesmet/colorpicker
[18]: https://github.com/akexorcist/Android-BluetoothSPPLibrary
[19]: https://github.com/greenrobot/EventBus

[usb_otg_version]: https://github.com/josejuansanchez/NanoPlayBoard-AndroidApp/blob/master/extras/_items.jpg
[bluetooth_version]: https://github.com/josejuansanchez/NanoPlayBoard-AndroidApp/blob/master/extras/bluetooth_beach.jpg

