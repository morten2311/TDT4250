/**
 */
package course_desc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course Preconditions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link course_desc.CoursePreconditions#isIsRequired <em>Is Required</em>}</li>
 *   <li>{@link course_desc.CoursePreconditions#getReductionPoints <em>Reduction Points</em>}</li>
 *   <li>{@link course_desc.CoursePreconditions#isIsRecommended <em>Is Recommended</em>}</li>
 *   <li>{@link course_desc.CoursePreconditions#getBelongsTo <em>Belongs To</em>}</li>
 * </ul>
 *
 * @see course_desc.Course_descPackage#getCoursePreconditions()
 * @model
 * @generated
 */
public interface CoursePreconditions extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Required</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Required</em>' attribute.
	 * @see #setIsRequired(boolean)
	 * @see course_desc.Course_descPackage#getCoursePreconditions_IsRequired()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsRequired();

	/**
	 * Sets the value of the '{@link course_desc.CoursePreconditions#isIsRequired <em>Is Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Required</em>' attribute.
	 * @see #isIsRequired()
	 * @generated
	 */
	void setIsRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>Reduction Points</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reduction Points</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reduction Points</em>' attribute.
	 * @see #setReductionPoints(double)
	 * @see course_desc.Course_descPackage#getCoursePreconditions_ReductionPoints()
	 * @model default="0"
	 * @generated
	 */
	double getReductionPoints();

	/**
	 * Sets the value of the '{@link course_desc.CoursePreconditions#getReductionPoints <em>Reduction Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reduction Points</em>' attribute.
	 * @see #getReductionPoints()
	 * @generated
	 */
	void setReductionPoints(double value);

	/**
	 * Returns the value of the '<em><b>Is Recommended</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Recommended</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Recommended</em>' attribute.
	 * @see #setIsRecommended(boolean)
	 * @see course_desc.Course_descPackage#getCoursePreconditions_IsRecommended()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsRecommended();

	/**
	 * Sets the value of the '{@link course_desc.CoursePreconditions#isIsRecommended <em>Is Recommended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Recommended</em>' attribute.
	 * @see #isIsRecommended()
	 * @generated
	 */
	void setIsRecommended(boolean value);

	/**
	 * Returns the value of the '<em><b>Belongs To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Belongs To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Belongs To</em>' reference.
	 * @see #setBelongsTo(Course)
	 * @see course_desc.Course_descPackage#getCoursePreconditions_BelongsTo()
	 * @model required="true"
	 * @generated
	 */
	Course getBelongsTo();

	/**
	 * Sets the value of the '{@link course_desc.CoursePreconditions#getBelongsTo <em>Belongs To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Belongs To</em>' reference.
	 * @see #getBelongsTo()
	 * @generated
	 */
	void setBelongsTo(Course value);

} // CoursePreconditions
