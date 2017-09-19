/**
 */
package course_desc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link course_desc.CourseInstance#getHasTimetable <em>Has Timetable</em>}</li>
 *   <li>{@link course_desc.CourseInstance#getInstanceOfCourse <em>Instance Of Course</em>}</li>
 *   <li>{@link course_desc.CourseInstance#getHasEvaluations <em>Has Evaluations</em>}</li>
 *   <li>{@link course_desc.CourseInstance#getYear <em>Year</em>}</li>
 *   <li>{@link course_desc.CourseInstance#getLectureHours <em>Lecture Hours</em>}</li>
 *   <li>{@link course_desc.CourseInstance#getLabHours <em>Lab Hours</em>}</li>
 *   <li>{@link course_desc.CourseInstance#getIsInstanceOf <em>Is Instance Of</em>}</li>
 *   <li>{@link course_desc.CourseInstance#getHasLecturers <em>Has Lecturers</em>}</li>
 *   <li>{@link course_desc.CourseInstance#getHasCourseCoordinator <em>Has Course Coordinator</em>}</li>
 * </ul>
 *
 * @see course_desc.Course_descPackage#getCourseInstance()
 * @model
 * @generated
 */
public interface CourseInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Timetable</b></em>' containment reference list.
	 * The list contents are of type {@link course_desc.Timetable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Timetable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Timetable</em>' containment reference list.
	 * @see course_desc.Course_descPackage#getCourseInstance_HasTimetable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Timetable> getHasTimetable();

	/**
	 * Returns the value of the '<em><b>Instance Of Course</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link course_desc.Course#getHasInstance <em>Has Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Of Course</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Of Course</em>' reference.
	 * @see #setInstanceOfCourse(Course)
	 * @see course_desc.Course_descPackage#getCourseInstance_InstanceOfCourse()
	 * @see course_desc.Course#getHasInstance
	 * @model opposite="hasInstance" required="true"
	 * @generated
	 */
	Course getInstanceOfCourse();

	/**
	 * Sets the value of the '{@link course_desc.CourseInstance#getInstanceOfCourse <em>Instance Of Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Of Course</em>' reference.
	 * @see #getInstanceOfCourse()
	 * @generated
	 */
	void setInstanceOfCourse(Course value);

	/**
	 * Returns the value of the '<em><b>Has Evaluations</b></em>' containment reference list.
	 * The list contents are of type {@link course_desc.Evaluation}.
	 * It is bidirectional and its opposite is '{@link course_desc.Evaluation#getBelongsTo <em>Belongs To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Evaluations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Evaluations</em>' containment reference list.
	 * @see course_desc.Course_descPackage#getCourseInstance_HasEvaluations()
	 * @see course_desc.Evaluation#getBelongsTo
	 * @model opposite="belongsTo" containment="true" required="true"
	 * @generated
	 */
	EList<Evaluation> getHasEvaluations();

	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Year</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(int)
	 * @see course_desc.Course_descPackage#getCourseInstance_Year()
	 * @model required="true"
	 * @generated
	 */
	int getYear();

	/**
	 * Sets the value of the '{@link course_desc.CourseInstance#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(int value);

	/**
	 * Returns the value of the '<em><b>Lecture Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lecture Hours</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lecture Hours</em>' attribute.
	 * @see #setLectureHours(double)
	 * @see course_desc.Course_descPackage#getCourseInstance_LectureHours()
	 * @model
	 * @generated
	 */
	double getLectureHours();

	/**
	 * Sets the value of the '{@link course_desc.CourseInstance#getLectureHours <em>Lecture Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lecture Hours</em>' attribute.
	 * @see #getLectureHours()
	 * @generated
	 */
	void setLectureHours(double value);

	/**
	 * Returns the value of the '<em><b>Lab Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lab Hours</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lab Hours</em>' attribute.
	 * @see #setLabHours(double)
	 * @see course_desc.Course_descPackage#getCourseInstance_LabHours()
	 * @model
	 * @generated
	 */
	double getLabHours();

	/**
	 * Sets the value of the '{@link course_desc.CourseInstance#getLabHours <em>Lab Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lab Hours</em>' attribute.
	 * @see #getLabHours()
	 * @generated
	 */
	void setLabHours(double value);

	/**
	 * Returns the value of the '<em><b>Is Instance Of</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link course_desc.Department#getResponsible <em>Responsible</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Instance Of</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Instance Of</em>' container reference.
	 * @see #setIsInstanceOf(Department)
	 * @see course_desc.Course_descPackage#getCourseInstance_IsInstanceOf()
	 * @see course_desc.Department#getResponsible
	 * @model opposite="responsible" required="true" transient="false"
	 * @generated
	 */
	Department getIsInstanceOf();

	/**
	 * Sets the value of the '{@link course_desc.CourseInstance#getIsInstanceOf <em>Is Instance Of</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Instance Of</em>' container reference.
	 * @see #getIsInstanceOf()
	 * @generated
	 */
	void setIsInstanceOf(Department value);

	/**
	 * Returns the value of the '<em><b>Has Lecturers</b></em>' containment reference list.
	 * The list contents are of type {@link course_desc.Lecturer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Lecturers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Lecturers</em>' containment reference list.
	 * @see course_desc.Course_descPackage#getCourseInstance_HasLecturers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Lecturer> getHasLecturers();

	/**
	 * Returns the value of the '<em><b>Has Course Coordinator</b></em>' containment reference list.
	 * The list contents are of type {@link course_desc.CourseCoordinator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Course Coordinator</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Course Coordinator</em>' containment reference list.
	 * @see course_desc.Course_descPackage#getCourseInstance_HasCourseCoordinator()
	 * @model containment="true"
	 * @generated
	 */
	EList<CourseCoordinator> getHasCourseCoordinator();

} // CourseInstance
