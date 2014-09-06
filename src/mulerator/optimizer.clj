(ns mulerator.optimizer (:gen-class))

(defn total-value [combo]
  (reduce + (for [d combo] (get d :doll-value))))

(defn max-combo-value [eligible-combos]
  (max (for [combo eligible-combos] (total-value combo))))


(defn combo-weight [combo]
  (reduce + (for [d combo] (get d :doll-weight))))


(defn select-by-weight [comibinations max-weight]
  (doseq [combo [comibinations]]))
    ; (if (<= (combo-weight combo) max-weight)
    ;   )))

(defn powerset [dollset]
  "Returns a power set or set of all combinations of dolls possible"
  (let [result (reduce (fn [sum x] (concat sum (map #(conj % x) sum))) [#{}] dollset)]
      (vec result)))

(defn optimize-value [packed-dolls max-weight]
  (let [doll-combinations (powerset packed-dolls)
        eligible-combos (select-by-weight doll-combinations max-weight)
        winning-combo (max-combo-value eligible-combos)]))