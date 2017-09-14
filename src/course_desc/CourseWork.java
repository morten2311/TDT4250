/**
 */
package course_desc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course Work</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link course_desc.CourseWork#getDuration <em>Duration</em>}</li>
 *   <li>{@link course_desc.CourseWork#getRoom <em>Room</em>}</li>
 *   <li>{@link course_desc.CourseWork#isIsMandatory <em>Is Mandatory</em>}</li>
 *   <li>{@link course_desc.CourseWork#isIsRestricted <em>Is Restricted</em>}</li>
 *   <li>{@link course_desc.CourseWork#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see course_desc.Course_descPackage#getCourseWork()
 * @model
 * @generated
 */
public interface CourseWork extends EObject {
	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(int)
	 * @see course_desc.Course_descPackage#getCourseWork_Duration()
	 * @model
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link course_desc.CourseWork#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(int value);

	/**
	 * Returns the value of the '<em><b>Room</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' attribute.
	 * @see #setRoom(String)
	 * @see course_desc.Course_descPackage#getCourseWork_Room()
	 * @model
	 * @generated
	 */
	String getRoom();

	/**
	 * Sets the value of the '{@link course_desc.CourseWork#getRoom <em>Room</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room</em>' attribute.
	 * @see #getRoom()
	 * @generated
	 */
	void setRoom(String value);

	/**
	 * Returns the value of the '<em><b>Is Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Mandatory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Mandatory</em>' attribute.
	 * @see #setIsMandatory(boolean)
	 * @see course_desc.Course_descPackage#getCourseWork_IsMandatory()
	 * @model
	 * @generated
	 */
	boolean isIsMandatory();

	/**
	 * Sets the value of the '{@link course_desc.CourseWork#isIsMandatory <em>Is Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Mandatory</em>' attribute.
	 * @see #isIsMandatory()
	 * @generated
	 */
	void setIsMandatory(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Restricted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Restricted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Restricted</em>' attribute.
	 * @see #setIsRestricted(boolean)
	 * @see course_desc.Course_descPackage#getCourseWork_IsRestricted()
	 * @model
	 * @generated
	 */
	boolean isIsRestricted();

	/**
	 * Sets the value of the '{@link course_desc.CourseWork#isIsRestricted <em>Is Restricted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Restricted</em>' attribute.
	 * @see #isIsRestricted()
	 * @generated
	 */
	void setIsRestricted(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link course_desc.CourseWorkType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see course_desc.CourseWorkType
	 * @see #setType(CourseWorkType)
	 * @see course_desc.Course_descPackage#getCourseWork_Type()
	 * @model
	 * @generated
	 */
	CourseWorkType getType();

	/**
	 * Sets the value of the '{@link course_desc.CourseWork#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see course_desc.CourseWorkType
	 * @see #getType()
	 * @generated
	 */
	void setType(CourseWorkType value);

} // CourseWork
