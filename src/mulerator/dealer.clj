(ns mulerator.dealer (:gen-class))

(defn user-input-str [call]
  (println ("%s:" call))
  (read-line))

(defn packed-dolls [])

;   (loop [x 0]
;     (while (x == 1)
;       (user-input)))