(ns mulerator.core (:require [mulerator.dealer] [mulerator.optimizer]) (:gen-class))

(defn to_i [string]
  (Integer. (re-find #"\d+" string)))

(defn user-input [call]
  (print(format "%s:" call))
  (flush)
  to_i(read-line))

(defn -main []
  (let [max-score (user-input "What was the Mule's weight today?")]
    (println max-score)))
