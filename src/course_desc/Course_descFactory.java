/**
 */
package course_desc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see course_desc.Course_descPackage
 * @generated
 */
public interface Course_descFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Course_descFactory eINSTANCE = course_desc.impl.Course_descFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Course</em>'.
	 * @generated
	 */
	Course createCourse();

	/**
	 * Returns a new object of class '<em>Course Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Course Instance</em>'.
	 * @generated
	 */
	CourseInstance createCourseInstance();

	/**
	 * Returns a new object of class '<em>Department</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Department</em>'.
	 * @generated
	 */
	Department createDepartment();

	/**
	 * Returns a new object of class '<em>Exam</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exam</em>'.
	 * @generated
	 */
	Exam createExam();

	/**
	 * Returns a new object of class '<em>Timetable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timetable</em>'.
	 * @generated
	 */
	Timetable createTimetable();

	/**
	 * Returns a new object of class '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Person</em>'.
	 * @generated
	 */
	Person createPerson();

	/**
	 * Returns a new object of class '<em>Course Preconditions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Course Preconditions</em>'.
	 * @generated
	 */
	CoursePreconditions createCoursePreconditions();

	/**
	 * Returns a new object of class '<em>Course Work</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Course Work</em>'.
	 * @generated
	 */
	CourseWork createCourseWork();

	/**
	 * Returns a new object of class '<em>Study Program</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Study Program</em>'.
	 * @generated
	 */
	StudyProgram createStudyProgram();

	/**
	 * Returns a new object of class '<em>Univ</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Univ</em>'.
	 * @generated
	 */
	Univ createUniv();

	/**
	 * Returns a new object of class '<em>Evaluation With Deadline</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evaluation With Deadline</em>'.
	 * @generated
	 */
	EvaluationWithDeadline createEvaluationWithDeadline();

	/**
	 * Returns a new object of class '<em>Student</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Student</em>'.
	 * @generated
	 */
	Student createStudent();

	/**
	 * Returns a new object of class '<em>Lecturer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lecturer</em>'.
	 * @generated
	 */
	Lecturer createLecturer();

	/**
	 * Returns a new object of class '<em>Course Coordinator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Course Coordinator</em>'.
	 * @generated
	 */
	CourseCoordinator createCourseCoordinator();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Course_descPackage getCourse_descPackage();

} //Course_descFactory
