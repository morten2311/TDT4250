/**
 */
package course_desc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timetable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link course_desc.Timetable#getHasCourseWork <em>Has Course Work</em>}</li>
 *   <li>{@link course_desc.Timetable#getPrograms <em>Programs</em>}</li>
 * </ul>
 *
 * @see course_desc.Course_descPackage#getTimetable()
 * @model
 * @generated
 */
public interface Timetable extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Course Work</b></em>' containment reference list.
	 * The list contents are of type {@link course_desc.CourseWork}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Course Work</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Course Work</em>' containment reference list.
	 * @see course_desc.Course_descPackage#getTimetable_HasCourseWork()
	 * @model containment="true"
	 * @generated
	 */
	EList<CourseWork> getHasCourseWork();

	/**
	 * Returns the value of the '<em><b>Programs</b></em>' reference list.
	 * The list contents are of type {@link course_desc.StudyProgram}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Programs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programs</em>' reference list.
	 * @see course_desc.Course_descPackage#getTimetable_Programs()
	 * @model
	 * @generated
	 */
	EList<StudyProgram> getPrograms();

} // Timetable
