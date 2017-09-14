/**
 */
package course_desc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evaluation With Deadline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link course_desc.EvaluationWithDeadline#getDeadlineEvaluation <em>Deadline Evaluation</em>}</li>
 * </ul>
 *
 * @see course_desc.Course_descPackage#getEvaluationWithDeadline()
 * @model
 * @generated
 */
public interface EvaluationWithDeadline extends Evaluation {
	/**
	 * Returns the value of the '<em><b>Deadline Evaluation</b></em>' attribute.
	 * The literals are from the enumeration {@link course_desc.DeadlineEvaluation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deadline Evaluation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deadline Evaluation</em>' attribute.
	 * @see course_desc.DeadlineEvaluation
	 * @see #setDeadlineEvaluation(DeadlineEvaluation)
	 * @see course_desc.Course_descPackage#getEvaluationWithDeadline_DeadlineEvaluation()
	 * @model
	 * @generated
	 */
	DeadlineEvaluation getDeadlineEvaluation();

	/**
	 * Sets the value of the '{@link course_desc.EvaluationWithDeadline#getDeadlineEvaluation <em>Deadline Evaluation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deadline Evaluation</em>' attribute.
	 * @see course_desc.DeadlineEvaluation
	 * @see #getDeadlineEvaluation()
	 * @generated
	 */
	void setDeadlineEvaluation(DeadlineEvaluation value);

} // EvaluationWithDeadline
