/**
 */
package course_desc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lecturer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link course_desc.Lecturer#getBelongsTo <em>Belongs To</em>}</li>
 * </ul>
 *
 * @see course_desc.Course_descPackage#getLecturer()
 * @model
 * @generated
 */
public interface Lecturer extends PersonRole {

	/**
	 * Returns the value of the '<em><b>Belongs To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Belongs To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Belongs To</em>' reference.
	 * @see #setBelongsTo(CourseInstance)
	 * @see course_desc.Course_descPackage#getLecturer_BelongsTo()
	 * @model
	 * @generated
	 */
	CourseInstance getBelongsTo();

	/**
	 * Sets the value of the '{@link course_desc.Lecturer#getBelongsTo <em>Belongs To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Belongs To</em>' reference.
	 * @see #getBelongsTo()
	 * @generated
	 */
	void setBelongsTo(CourseInstance value);
} // Lecturer
