(ns mulerator.optimizer (:gen-class))

(defn powerset [dollset]
  (let [result (reduce (fn [dollsets x] (concat dollsets (map #(conj % x) dollsets))) [#{}] dollset)]
      (vec result)))

(defn optimize-value []
  )