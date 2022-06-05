/**
 */
package k8s;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link k8s.Handler#getExec <em>Exec</em>}</li>
 * </ul>
 *
 * @see k8s.K8sPackage#getHandler()
 * @model
 * @generated
 */
public interface Handler extends EObject {
	/**
	 * Returns the value of the '<em><b>Exec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exec</em>' reference.
	 * @see #setExec(ExecAction)
	 * @see k8s.K8sPackage#getHandler_Exec()
	 * @model required="true" transient="true"
	 * @generated
	 */
	ExecAction getExec();

	/**
	 * Sets the value of the '{@link k8s.Handler#getExec <em>Exec</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exec</em>' reference.
	 * @see #getExec()
	 * @generated
	 */
	void setExec(ExecAction value);

} // Handler
