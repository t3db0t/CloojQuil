(ns CloojQuil.core
  (:use [quil core applet]))

(defn setup []
  (smooth)                          ;;Turn on anti-aliasing
  (frame-rate 30)                    ;;Set framerate to 1 FPS
  (background 200))                 ;;Set the background colour to
                                    ;;  a nice shade of grey.
(defn draw []
  (stroke (random 255) (random 255) (random 255))             ;;Set the stroke colour to a random grey
  (stroke-weight (random 10))       ;;Set the stroke thickness randomly
  (fill (random 255) (random 255) (random 255))               ;;Set the fill colour to a random grey
  ;(fill 100 250 0)
  (let [diam (random 100)           ;;Set the diameter to a value between 0 and 100
        x    (random (width))       ;;Set the x coord randomly within the applet
        y    (random (height))]     ;;Set the y coord randomly within the applet
    (ellipse x y diam diam)))       ;;Draw a circle at x y with the correct diameter

(defapplet example                  ;;Define a new applet named example
  :title "Oh so many grey circles"  ;;Set the title of the applet
  :setup setup                      ;;Specify the setup fn
  :draw draw                        ;;Specify the draw fn
  :size [323 200])                  ;;You struggle to beat the golden ratio