/**
 */
package course_desc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link course_desc.PersonRole#getLinkedTo <em>Linked To</em>}</li>
 *   <li>{@link course_desc.PersonRole#getBelongsTo <em>Belongs To</em>}</li>
 * </ul>
 *
 * @see course_desc.Course_descPackage#getPersonRole()
 * @model abstract="true"
 * @generated
 */
public interface PersonRole extends EObject {
	/**
	 * Returns the value of the '<em><b>Linked To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link course_desc.Person#getHasRole <em>Has Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linked To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linked To</em>' reference.
	 * @see #setLinkedTo(Person)
	 * @see course_desc.Course_descPackage#getPersonRole_LinkedTo()
	 * @see course_desc.Person#getHasRole
	 * @model opposite="hasRole"
	 * @generated
	 */
	Person getLinkedTo();

	/**
	 * Sets the value of the '{@link course_desc.PersonRole#getLinkedTo <em>Linked To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linked To</em>' reference.
	 * @see #getLinkedTo()
	 * @generated
	 */
	void setLinkedTo(Person value);

	/**
	 * Returns the value of the '<em><b>Belongs To</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link course_desc.CourseInstance#getHasPersonRole <em>Has Person Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Belongs To</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Belongs To</em>' container reference.
	 * @see #setBelongsTo(CourseInstance)
	 * @see course_desc.Course_descPackage#getPersonRole_BelongsTo()
	 * @see course_desc.CourseInstance#getHasPersonRole
	 * @model opposite="hasPersonRole" transient="false"
	 * @generated
	 */
	CourseInstance getBelongsTo();

	/**
	 * Sets the value of the '{@link course_desc.PersonRole#getBelongsTo <em>Belongs To</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Belongs To</em>' container reference.
	 * @see #getBelongsTo()
	 * @generated
	 */
	void setBelongsTo(CourseInstance value);

} // PersonRole
