(into [:jewel]
  (set [:fruit :fruit :tea :fruit]))

(loop [iter 0]
  (println "Iteration" iter)
  (if (> iter 3)
    (println "Bye")
    (recur (inc iter))))

(defn abrahamic? [name]
  (boolean (re-find #"^Al-" name)))

(abrahamic? "Jesus")
(abrahamic? "Al-Quran")
(abrahamic? "Al-Jazeera")

; (def x 5)
;
; (let [x (inc x)] (+ x 1))
;
; (str x)
;
; (def names
;   ["John" "Jerry" "Joe" "Jane" "Jury"])
;
; (let [first-two (take 2 names)]
;   (str "First Two is "
;     (clojure.string/join " and " first-two)))
;
; (let [[leader co-leader & friends] names]
;   (str
;    leader
;    " is the group leader, along with "
;    co-leader
;    ". They're friends with "
;    (clojure.string/join ", " friends)))
