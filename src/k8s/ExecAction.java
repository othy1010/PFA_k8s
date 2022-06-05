/**
 */
package k8s;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exec Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link k8s.ExecAction#getCommand <em>Command</em>}</li>
 * </ul>
 *
 * @see k8s.K8sPackage#getExecAction()
 * @model
 * @generated
 */
public interface ExecAction extends EObject {
	/**
	 * Returns the value of the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' attribute.
	 * @see #setCommand(EList)
	 * @see k8s.K8sPackage#getExecAction_Command()
	 * @model many="false" transient="true"
	 * @generated
	 */
	EList<String> getCommand();

	/**
	 * Sets the value of the '{@link k8s.ExecAction#getCommand <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' attribute.
	 * @see #getCommand()
	 * @generated
	 */
	void setCommand(EList<String> value);

} // ExecAction
