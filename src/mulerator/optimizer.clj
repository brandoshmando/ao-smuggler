(ns mulerator.optimizer (:gen-class))
; Returns the toral value of a given packed doll combination
(defn total-value [combo]
  (reduce + (for [d combo] (get d :doll-value))))
; Determines max combination value from eligible doll combinations
(defn max-combo-value [eligible-combos]
  (max (for [combo eligible-combos] (total-value combo))))
; Returns a weight for a given combo value
(defn combo-weight [combo]
  (reduce + (for [d combo] (get d :doll-weight))))

; Removes in-elligible combinations if their weight exceeds the max weight
(defn select-by-weight [comibinations max-weight]
  (doseq [combo [comibinations]]))
    ; (if (<= (combo-weight combo) max-weight)
    ;   )))
; Returns a set of all possible combinations of packed dolls
(defn powerset [dollset]
  (let [result (reduce (fn [sum x] (concat sum (map #(conj % x) sum))) [{}] dollset)]
      (vec result)))
; Initializes optimization of packed dolls/Function caller for optimizer module
(defn optimize-value [packed-dolls max-weight]
  (let [doll-combinations (powerset packed-dolls)
        eligible-combos (select-by-weight doll-combinations max-weight)
        winning-combo (max-combo-value eligible-combos)]))