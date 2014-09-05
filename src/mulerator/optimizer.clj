(ns mulerator.optimizer (:gen-class))

(defn combo-weight [combo]
  (reduce + (for [d [combo]] (get d :doll-weight))))


(defn select-by-weight [comibinations max-weight]
  (doseq [combo [comibinations]]))
    ; (if (<= (combo-weight combo) max-weight)
    ;   )))

(defn powerset [dollset]
  (let [result (reduce (fn [sum x] (concat sum (map #(conj % x) sum))) [#{}] dollset)]
      (vec result)))

(defn optimize-value []
  )