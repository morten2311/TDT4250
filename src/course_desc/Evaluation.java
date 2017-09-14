/**
 */
package course_desc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evaluation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link course_desc.Evaluation#getPercentage <em>Percentage</em>}</li>
 *   <li>{@link course_desc.Evaluation#getBelongsTo <em>Belongs To</em>}</li>
 * </ul>
 *
 * @see course_desc.Course_descPackage#getEvaluation()
 * @model abstract="true"
 * @generated
 */
public interface Evaluation extends EObject {
	/**
	 * Returns the value of the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Percentage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentage</em>' attribute.
	 * @see #setPercentage(double)
	 * @see course_desc.Course_descPackage#getEvaluation_Percentage()
	 * @model
	 * @generated
	 */
	double getPercentage();

	/**
	 * Sets the value of the '{@link course_desc.Evaluation#getPercentage <em>Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage</em>' attribute.
	 * @see #getPercentage()
	 * @generated
	 */
	void setPercentage(double value);

	/**
	 * Returns the value of the '<em><b>Belongs To</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link course_desc.CourseInstance#getHasEvaluations <em>Has Evaluations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Belongs To</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Belongs To</em>' container reference.
	 * @see #setBelongsTo(CourseInstance)
	 * @see course_desc.Course_descPackage#getEvaluation_BelongsTo()
	 * @see course_desc.CourseInstance#getHasEvaluations
	 * @model opposite="hasEvaluations" transient="false"
	 * @generated
	 */
	CourseInstance getBelongsTo();

	/**
	 * Sets the value of the '{@link course_desc.Evaluation#getBelongsTo <em>Belongs To</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Belongs To</em>' container reference.
	 * @see #getBelongsTo()
	 * @generated
	 */
	void setBelongsTo(CourseInstance value);

} // Evaluation
