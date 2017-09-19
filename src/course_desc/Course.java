/**
 */
package course_desc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link course_desc.Course#getCode <em>Code</em>}</li>
 *   <li>{@link course_desc.Course#getName <em>Name</em>}</li>
 *   <li>{@link course_desc.Course#getContent <em>Content</em>}</li>
 *   <li>{@link course_desc.Course#getCredits <em>Credits</em>}</li>
 *   <li>{@link course_desc.Course#getHasInstance <em>Has Instance</em>}</li>
 *   <li>{@link course_desc.Course#getHasPrecondition <em>Has Precondition</em>}</li>
 * </ul>
 *
 * @see course_desc.Course_descPackage#getCourse()
 * @model
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see course_desc.Course_descPackage#getCourse_Code()
	 * @model required="true"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link course_desc.Course#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see course_desc.Course_descPackage#getCourse_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link course_desc.Course#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see course_desc.Course_descPackage#getCourse_Content()
	 * @model required="true"
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link course_desc.Course#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

	/**
	 * Returns the value of the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Credits</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credits</em>' attribute.
	 * @see #setCredits(Double)
	 * @see course_desc.Course_descPackage#getCourse_Credits()
	 * @model required="true"
	 * @generated
	 */
	Double getCredits();

	/**
	 * Sets the value of the '{@link course_desc.Course#getCredits <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credits</em>' attribute.
	 * @see #getCredits()
	 * @generated
	 */
	void setCredits(Double value);

	/**
	 * Returns the value of the '<em><b>Has Instance</b></em>' reference list.
	 * The list contents are of type {@link course_desc.CourseInstance}.
	 * It is bidirectional and its opposite is '{@link course_desc.CourseInstance#getInstanceOfCourse <em>Instance Of Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Instance</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Instance</em>' reference list.
	 * @see course_desc.Course_descPackage#getCourse_HasInstance()
	 * @see course_desc.CourseInstance#getInstanceOfCourse
	 * @model opposite="instanceOfCourse"
	 * @generated
	 */
	EList<CourseInstance> getHasInstance();

	/**
	 * Returns the value of the '<em><b>Has Precondition</b></em>' reference list.
	 * The list contents are of type {@link course_desc.CoursePreconditions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Precondition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Precondition</em>' reference list.
	 * @see course_desc.Course_descPackage#getCourse_HasPrecondition()
	 * @model
	 * @generated
	 */
	EList<CoursePreconditions> getHasPrecondition();

} // Course
